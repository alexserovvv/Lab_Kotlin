fun main() {


    val contacts = listOf(
        Contact.Messenger("185621", "FBK"),
        Contact.PhoneNumber("+789442804950", PhoneType.PERSONAL),
        Contact.Email("AlexNav@mgmail.com")

    )
    val user1 = Users("Alex", "Nav", 45, contacts)

    val contacts2 = listOf(
        Contact.Messenger("@20002024", "MVD"),
        Contact.PhoneNumber("+79777777777", PhoneType.WORK),
        Contact.Email("PrsdntMira@mail.ru")

    )
    val user2 = Users("Vladimir", "Put", 71, contacts2)

    val contacts3 = listOf(
        Contact.Messenger("@20172021", "Vdud"),
        Contact.PhoneNumber("+79118908008", PhoneType.HOME),
        Contact.Email("proff@gmail.com"),
    )
    val user3 = Users("Yuri", "Vdu", 30, contacts3)

    val contacts4 = listOf(
        Contact.Messenger("@20002020", "Liter"),
        Contact.PhoneNumber("+7(495)5800000", PhoneType.HOME),
        Contact.Email("Limonov@gmail.com"),
    )
    val user4 = Users("Andrey ", "limonov", 62, contacts4)

    val contacts5 = listOf(
        Contact.Messenger("@20082012", "OnlyChange"),
        Contact.PhoneNumber("+79777777776", PhoneType.WORK),
        Contact.Email("Limonov@gmail.com"),
    )
    val user5 = Users("Dmitry", "Medvded", 62, contacts5)


    val useres6: List<Users> = listOf(user1, user3, user4)

    println(useres6)

    val useres13: List<Users> = listOf(user2, user5)

    println (useres13)
}




