package org.example;

public class homework5 {

    public static void main(String[] args) {

        Worker[] worker = new Worker[5];
        worker[0] = new Worker("TGF","Менеджер","TrofimovGrigorii@bk.ru",45,"555-5213",45000);
        worker[1] = new Worker("THA","Старший менеджер","TarahtelkinaHrestina@mail.ru",36,"555-3651",95000);
        worker[2] = new Worker("BAT","Специалист","BatonovAleksandr@yandex.ru",52,"555-8741",35000);
        worker[3] = new Worker("OFM","Помошник бухгалтера","OchakovFilip@bk.ru",27,"555-8368",40000);
        worker[4] = new Worker("WTF","Бухгалтер","WinigradovaTatiana@google.com",48,"555-7315",42000);

        for (int i = 0; i < worker.length; i++) {
            if(worker[i].getAge() > 40){
                worker[i].printInfo();
            }
        }
    }
}
