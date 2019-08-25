package hot_100.QueueReconstructionByHeight

import java.util.{ArrayList, Arrays, Comparator, List}

class QueueReconstructionByHeight_scala {
  def reconstructQueue(people: Array[Array[Int]]): Array[Array[Int]] = {
    if (0 == people.length || 0 == people(0).length)
      return new Array[Array[Int]](0)
    //按照身高降序 K升序排序
    Arrays.sort(people, new Comparator[Array[Int]]() {
      override def compare(o1: Array[Int], o2: Array[Int]): Int = if (o1(0) == o2(0)) o1(1) - o2(1)
      else o2(0) - o1(0)
    })
    val list = new ArrayList[Array[Int]]
    //K值定义为 排在h前面且身高大于或等于h的人数
    //因为从身高降序开始插入，此时所有人身高都大于等于h
    //因此K值即为需要插入的位置
    for (i <- people) {
      list.add(i(1), i)
    }
    list.toArray(new Array[Array[Int]](list.size))
  }
}
