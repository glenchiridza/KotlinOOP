import java.nio.file.Path

/**
 * Created by glenc on Jan 2021
 **/
interface Logger {

    fun debug(msg:String)
    fun warn(msg:String)
    fun info(msg:String){
        warn("default info implementation")
    }

}

