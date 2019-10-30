package hot_100.GenerateParentheses_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateParentheses_java {
    public List<String> generateParenthesis(int n) {
        if (n < 1) return Collections.emptyList();
        if (n == 1) return Collections.singletonList("()");

        List<String> res = new ArrayList<>();
        // recursion
        this._generate(1, n, res, "("); // 必是'('
        return res;
    }

    private void _generate(int leftCnt, int max, List<String> res, String curr) {
        // terminator
        if (curr.length() >= max * 2) { // 总长已满，已到状态树最底层(叶子结点)
            res.add(curr);
            return;
        }

        // process
        // drill down
        if (leftCnt < max) { // 左括号个数受限
            this._generate(leftCnt + 1, max, res, curr + "(");
        }

        // 右括号个数 = 当前字符长度 - 左括号个数
        // rightCnt = curr.length() - leftCnt
        // rightCnt < leftCnt
        if (curr.length() < leftCnt * 2) { // 右比左少，必在受限max之内
            this._generate(leftCnt, max, res, curr + ")");
        }
        // reverse state
    }

}
