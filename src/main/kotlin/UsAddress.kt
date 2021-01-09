
abstract class PostAddress(val firstLine: String,
                           val secondLine:String,
                           val city: String,
                           val country: String,
                           val postCode: PostalCode) : Location(){

}

class USAddress(firstLine: String,
                 secondLine:String,
                 city: String,
                 country: String,
                 postCode: PostalCode
                ) : PostAddress(firstLine,secondLine,city,country,postCode)

class UKAddress(firstLine: String,
                 secondLine:String,
                 city: String,
                 country: String,
                 zipCode: PostalCode
) : PostAddress(firstLine,secondLine,city,country,zipCode)