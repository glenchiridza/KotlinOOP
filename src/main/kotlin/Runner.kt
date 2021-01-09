import java.nio.file.Paths

fun main(args: Array<String>) {
    println("Members")

    val postalCode = UKPostCode("12345")
    val logger:Logger = FileLogger(Paths.get("/some/location"))

    var meeting = Meeting("Review", UKAddress("118","nyanga drive","Rusape","Zimbabwe",postalCode),logger)
    val review = PersonalReview("Progress Review Meeting",Participant(Name("Faith Chiridza"),"frchiridza@gmail.com"),
        listOf(),Room("GlenLone"),logger)
    println("created: $review with name ${review.meetingName} at rendezvous ${review.location}")
    review.closeReview()

    val name = Name("Glen")

    val participant = Participant(name,"glen@gmail.com")
//    participant.name = name
//    participant.email = "glen@gmail.com"
//    val canonicalEmail = participant.canonicalEmail

    meeting.addParticipants(participant)

//    meeting.logger
//    meeting.meetingName = "Review"

}