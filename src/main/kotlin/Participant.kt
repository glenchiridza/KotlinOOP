class Participant(val name:Name, val email:String) {
//    var name: Name = Name()
//    var email = ""

    val participantName
        get() = name.name

    val canonicalEmail
        get() = email.toUpperCase()

}