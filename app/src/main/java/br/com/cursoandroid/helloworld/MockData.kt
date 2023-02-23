package br.com.cursoandroid.helloworld

object MockData {

    fun getMockUsers() : List<User> {
        val user1 = User("Vitor", 27)
        val user2 = User("Alexandre", 28)
        val user3 = User("Joao", 29)
        val user4 = User("Mariana", 30)

        val listUsers = listOf(user1, user2, user3, user4)
        return listUsers
    }
}