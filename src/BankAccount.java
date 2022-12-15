import java.util.HashMap;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BankAccount() {
        this.amount = amount;
    }

    public  void  deposit(double sum) {
        amount = amount +sum;
        System.out.println("вы внесли в счет:" + sum);
    }



    public  void withDraw(int sum) throws  LimitException{
        if (sum <amount){
            throw new LimitException( "Ошибка,Недостаточнно средств" , amount);

        }else {
            System.out.println("вы можете снять со счета: "+sum);
            amount=amount -sum;
            System.out.println("вы сняли с счета: "+ sum);



        }
    }
}


//#ДЗ 3-й урок
//        3)  (Дэдлайн до урока)
//        a)  Написать класс проверяемого исключения LimitException,
//        с конструктором LimitException(String message, double remainingAmount) и методом getRemainingAmount().
//        b)  Написать класс BankAccount с 1 полем double amount
//        - остаток на счете и методами getAmount() - возвращает текущий остаток на счете,
//        deposit(double sum) - положить деньги на счет, withDraw(int sum) - снимает указанную сумму со счета.
//        c)  Также метод withDraw() может сгенерировать исключение в том случае
//        если запрашиваемая сумма на снятие больше чем остаток денег на счете.
//        d)  Написать Main класс где бы создавался счет клиента. Положить 20 000 сом на счет.
//        e)  Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом,
//        при этом отлавливать исключение LimitException и при возникновении такого исключения снимать только ту сумму,
//        которая осталась на счете и завершать бесконечный цикл