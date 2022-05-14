fun main() {

    val comment = Comments(1, true, true, true, true)
    val like = Likes(1,true, true, true)
    val repost = Reposts(1,true)


    var post1 = Post(0, 1, 2, 1, 1648204060, "Some text1",
        1, 1,1, comment, like, repost,
        " ", 1,true, true, true, true,
        false)

    var post2 = Post(0, 1, 2, 1, 1648204060, "Some text2",
        1, 1,1, comment, like, repost,
        " ", 1,true, true, true, true,
        false)

    var post3 = Post(1, 10, 999, 999, 999, "Some text3",
        999, 999,999, comment, like, repost,
        " ", 1,true, true, true, true,
        false)


}
