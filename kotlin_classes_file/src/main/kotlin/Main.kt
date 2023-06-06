import java.io.File

fun main() {

}

class Display {
    fun input_file(): File {
        print("Введите имя файла:")
        var file_name = readln()
        val extension = ".txt"
        file_name += extension
        val file_object = File(file_name)
        return file_object
    }

    fun create_file(){
        val file_object = input_file()
        val fileExists = file_object.exists()
        if (fileExists) {
            println("Уже существует файл с заданным именем")
            create_file()
        }
        print("Введите текст:")
        val text = readln()
        file_object.writeText(text)
    }

    fun open_file() {
        val file_object = input_file()
        val fileExists = file_object.exists()
        if (fileExists == false) {
            println("Файл не найден")
            open_file()
        }
    }
    fun output_strings(){

    }
    fun edit_strings(){

    }
    fun close_file(){

    }

}

class Manager {
    fun read_file(file: File){

    }
}