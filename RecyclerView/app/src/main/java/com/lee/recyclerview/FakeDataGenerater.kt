package com.lee.recyclerview

class FakeDataGenerater {


    fun getFakeUsers() : ArrayList<User>{
        var users = arrayListOf<User>()

        users.add(User("Andy","Andy0012@gmail.com"))
        users.add(User("Bob","Bob2231@gmail.com"))
        users.add(User("Carol","Carol23@gmail.com"))
        users.add(User("Harry","harryhost2@gmail.com"))
        users.add(User("Ian","ian0266@gmail.com"))
        users.add(User("Jack","jackone@gmail.com"))
        users.add(User("Leo","Leo66@gmail.com"))
        users.add(User("Morrie","morries22@gmail.com"))
        users.add(User("Dandy","Dandydog2@gmail.com"))
        users.add(User("Eddie","Eddie2231@gmail.com"))
        users.add(User("Frank","frankoo3@gmail.com"))
        users.add(User("Gary","garygod@gmail.com"))


        return users
    }
}