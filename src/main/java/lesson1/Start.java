/**
 * JavaCore.HW1
 * @ author Anton Filatov
 * @ version 14.11.2022
 */
/**
 * 1. Разобраться с имеющимся кодом.
 * 2. Добавить класс Team, который будет содержать:
 * название команды;
 * массив из четырех участников — в конструкторе можно сразу всех участников указывать);
 * метод для вывода информации о членах команды, прошедших дистанцию;
 * метод вывода информации обо всех членах команды.
 * 3. Добавить класс Course (полоса препятствий), в котором будут находиться:
 * массив препятствий;
 * метод, который будет просить команду пройти всю полосу.
 */

package lesson1;

public class Start {
    public static void main(String[] args) {

        Course course = new Course(new Cross(300), new Wall(2));

        Team team = new Team("Team", new Mouse("Jerry"), new Cat("Tom"),
                new Dog("Spike"), new Puppy("Tyke"));

        course.doIt(team);

        System.out.println("\n===== RESULTS =====\n");
        team.showResults();
    }
}
