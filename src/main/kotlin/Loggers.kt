import java.nio.file.Path

/**
 * Created by glenc on Jan 2021
 **/

interface Message{
    fun info(){

}
}

class FileLogger(val file: Path):Logger,Message {
    override fun debug(msg: String) {

    }

    override fun warn(msg: String) {

    }
}

class ConsoleLogger: Logger, Message{
    override fun debug(msg: String) {

    }

    override fun warn(msg: String) {

    }

    override fun info(msg: String) {
        //picking the appropriate super type implementation, "diamond problem of inheriting from two interfaces with the same method
        super<Logger>.info(msg)
        super<Message>.info()
    }
}