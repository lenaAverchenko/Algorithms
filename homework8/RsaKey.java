package algorithms.homework8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RsaKey {

    //public key
    /*
    * Все примеры мы рассмотрели на уроке:
    * 1) Работа с БД
    * 2) Шифрование
    *    Например, шифрование в мессенджерах, писем, и любой другой информации
    * 3) Целостность данных
    *    могут быть не только передача файлов между знакомыми, но также передача фото на сервисы: например,
    *    банк, гос.службы, и т.д. (где необходима передача данных)
    *
    *    Возможно также, можно заметить, что файл был не просто неверно загружен, но и теперь содержит вирус.
    *    Не будет выявлен этот код вирусный, но, например, можно запретить открытие или воспроизведение поврежденного файла,
    *    косвенно не давая вирусу воспроизвестись (это только идея)
    * 4) Цифровые подписи
    * 5) Хранение паролей
    * 6) Блокчейн
    *
    *
    * */
    /**
     * ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCwlUqkfBf5duoKkAyZCJeJgCHuvikTjFnD0TIp0Wy481U+peBIm0+wNymY4ehirOzt3YCV1
     * fsvqCnFQjSjZRe9qLAnMBujxHjIilIoa8kYRfANlWKIRy0x3cS3NNlvaUv66GZyQAr2ZE7vfn0w4PCIRmKNhS+0qtg/4aY8dGA1KY3CQDer0j
     * THhml+BZCQit5vaD47ry9IEzaVd7O9yyEoc1P6Atm6qz6d0h5Djn075yehnsXtzYrh+VyUSBGbH6JS0mJJHuJAM5uPsoWi0TZXxwS7eAtPJs4
     * Jz8YhCodN9BzZbx0imvxw6XyqCpXLFPDe09ZS8uP0KghEre5KfxpDBo7kd5zXOvpDS2p3woRG6CditEISIfQnRMlC00ZDy4phlSQ+qIDCFqlA
     * 9i3EJ1fBt6m6xJ0DtVuL+l5GqgFnxHhIwTp7jd4WytyK097ll/GTtKin+ZlF9dVXCK7HW/tAAdj37svfnXn1hr8nWyxH0dIR206JmM/I+WWAde
     * NfgG0= Пользователь@DESKTOP-K42RMN2
     * */

    public static void main(String[] args) {
        int[] a = {3,1,7,9,9,5};
        Arrays.sort(a);
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i]);
        }
    }
}
