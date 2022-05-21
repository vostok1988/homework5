fun main() {
    val post = Post(
        1, 1, 1, 1, 2004,
        "Hello", 1, 1, false,
        Comments(1, true, true, true, true),
        Copyright(1, "", "name", "type"),
        Likes(1, true, true, true),
        Reposts(1, true), View(1), "post", 1,
        PostSource("", "", "", ""),
        Geo(
            "", "", Place(
                1, "", 12, 17,
                1, "", 1, 2, 8, 5, 1, ""
            )
        ), copyHistory = null,
        Donut(
            true, 480, 4,
            false, ""
        ),
        true, true, true, false,
        true, false, 1, attachments = null
    )

    val firstAttachment = post.attachments?.get(0)
    if (firstAttachment is AudioAttachment) {
        println(firstAttachment)
    }

}