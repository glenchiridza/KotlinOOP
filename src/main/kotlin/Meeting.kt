import java.nio.file.Paths

/**
 * Created by glenc on Jan 2021
 **/
open class Meeting (val meetingName:String, open val location:Location, val logger:Logger){

//     private val  logger = FileLogger(Paths.get("/some/location"))
//    var location:Location = Location("Default Location");
//    constructor(meetingName: String, location: Location) : this(meetingName){
//        this.location = location
//    }


    public fun addParticipants(participant: Participant){
        logger.info("participant added")
        if (verifyParticipant(participant))
            println("Create ${participant.participantName}")
    }

    private fun verifyParticipant(participant: Participant): Boolean{
        println("verifying")
        return true
    }

    protected open fun verifyMeeting(){
     println("Meeting class verify meeting")
    }


}

class PersonalReview(meetingName: String, val employee:Participant, reviewers:List<Participant>,override val location:Location,logger: Logger)
    : Meeting(meetingName,location,logger){

    fun closeReview(){
        println("review ended")
        verifyMeeting()
    }


    override fun verifyMeeting(){
        println("PersonalReview class verify meeting")
        super.verifyMeeting()
    }
}