import java.lang.IllegalArgumentException
import java.util.regex.Pattern

/**
 * Created by glenc on Jan 2021
 **/
abstract class PostalCode(val postCode:String){

    abstract fun verify()

    init {
        //call verify method whenever we create an instance of this class
        verify()
    }
}

class USZipCode(zipCode: String) : PostalCode(zipCode){

    override fun verify(){
        val pattern = Pattern.compile(" ^[0-9]{5}(?:-[0-9]{4})?\$")
        val matcher = pattern.matcher(postCode)
        if (!matcher.matches()) throw IllegalArgumentException()
    }
}

class UKPostCode(postCode: String) : PostalCode(postCode){

    override fun verify(){

    }
}