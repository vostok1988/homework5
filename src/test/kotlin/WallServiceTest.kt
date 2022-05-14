import org.junit.Assert.*


class WallServiceTest {

    @org.junit.Test
    fun add() {
        val examplePost = Post(
            0, 1, 2, 1, 1648204060, "Some text",
            1, 1, 1, Comments(1, true, true, true, true),
            Likes(1, true, true, true),
            Reposts(1, true),  " ", 1, true, true, true, true,
            false
        )
        val expected = 7

        val result = WallService.add(examplePost).id

        assertEquals(expected, result)
    }

    @org.junit.Test
    fun updateExistingTrue() {
        WallService.add(
            Post(
                0, 1, 2, 1, 1648204060, "Some text",
                1, 1, 1, Comments(1, true, true, true, true),
                Likes(1, true, true, true),
                Reposts(1, true),  " ", 1, true, true, true, true,
                false
            )
        )
        WallService.add(
            Post(
                0, 1, 2, 1, 1648204060, "Some text",
                1, 1, 1, Comments(1, true, true, true, true),
                Likes(1, true, true, true),
                Reposts(1, true), " ", 1, true, true, true, true,
                false
            )
        )
        WallService.add(
            Post(
                0, 1, 2, 1, 1648204060, "Some text",
                1, 1, 1, Comments(1, true, true, true, true),
                Likes(1, true, true, true),
                Reposts(1, true),  " ", 1, true, true, true, true,
                false
            )
        )

        val update = Post(
            1, 1, 2, 1, 1648204060, "Some text1",
            1, 1, 1, Comments(1, true, true, true, true),
            Likes(1, true, true, true),
            Reposts(1, true),  " ", 1, true, true, true, true,
            false
        )

        val result = WallService.update(update)

        assertTrue(result)

    }

    @org.junit.Test
    fun updateExistingFalse() {
        WallService.add(
            Post(
                0, 1, 2, 1, 1648204060, "Some text",
                1, 1, 1, Comments(1, true, true, true, true),
                Likes(1, true, true, true),
                Reposts(1, true), " ", 1, true, true, true, true,
                false
            )
        )
        WallService.add(
            Post(
                0, 1, 2, 1, 1648204060, "Some text",
                1, 1, 1, Comments(1, true, true, true, true),
               Likes(1, true, true, true),
                Reposts(1, true)," ", 1, true, true, true, true,
                false
            )
        )
        WallService.add(
            Post(
                0, 1, 2, 1, 1648204060, "Some text",
                1, 1, 1, Comments(1, true, true, true, true),
                 Likes(1, true, true, true),
                Reposts(1, true), " ", 1, true, true, true, true,
                false
            )
        )

        val update = Post(
            5, 1, 2, 1, 1648204060, "Some text1",
            1, 1, 1, Comments(1, true, true, true, true),
            Likes(1, true, true, true),
            Reposts(1, true)," ", 1, true, true, true, true,
            false
        )

        val result = WallService.update(update)

        assertFalse(result)

    }
}