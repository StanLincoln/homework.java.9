package Homework9;
//        Сформировать строку, сходную с  SQL запросом, используя StringBuilder:
//        1) Берем исходную строку с данными из cars
//        {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
//        Если значение второго параметра равно null с каждой пары, то параметр не должен попадать в
//                условие отбора, которое задается после ключевого слова WHERE в результирующей строке.
//        Пример: строка с данными из users: {"id", 1, "country", null, "city", "Helsinki", "year", null}
//        Результат, новая строка:  SELECT * FROM users WHERE id = '1'  AND city = 'Helsinki';


public class Task2 {
    public static void main(String[] args) {
        Object[] data = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true};

        StringBuilder sqlBuilder = new StringBuilder("SELECT * FROM cars WHERE");
        for (int i = 0; i < data.length; i += 2) {
            String param = (String) data[i];
            Object value = data[i+1];

            if (value!=null){
                if(sqlBuilder.charAt(sqlBuilder.length()-1)!='E') {
                    sqlBuilder.append(" AND");
                }
                sqlBuilder.append(" ").append(param).append(" = '").append(value).append("'");
            }
        }
        System.out.println(sqlBuilder.toString());
    }
}

