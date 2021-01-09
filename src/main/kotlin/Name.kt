import java.lang.IllegalArgumentException

class Name (val name:String){
//    var name:String =""
//        set(value:String){
//            if (value.isNullOrBlank()) throw IllegalArgumentException()
//            field = value
//        }

    init {
        if (name.isBlank()) throw IllegalArgumentException()
    }
}