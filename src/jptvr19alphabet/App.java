/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19alphabet;

/**
 *
 * @author User
 */
class App {
    public void run(){
    String str = "Съешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я.";
    str = str.toLowerCase();
    boolean success = true;
    for(char c = 'а';c <= 'я'; ++c) {
        if(!str.contains(String.valueOf(c))) {
            success = false;
            break;
    }
}

if (success)
    System.out.println("Строка содержит все буквы алфавита.");
else
    System.out.println("В строке не хватает букв, для полного алфавита.");
    }
}
