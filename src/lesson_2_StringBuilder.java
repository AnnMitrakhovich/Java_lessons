public class lesson_2_StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("select * from students where ");
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        String replacedPARAMS = PARAMS.replaceAll("[{}\"]", "");
        String[] selectedPARAMS = replacedPARAMS.split(",");
        //Метод trim() удаляет пробельные символы с начала и конца строки.
        for (int i = 0; i < selectedPARAMS.length; i++) {
            String[] words = selectedPARAMS[i].split(":");
            if (!"null".equals(words[1].trim())) {
                builder.append(words[0]).append("=").append("'").append(words[1]).append("'");
                if (i<selectedPARAMS.length - 2) {
                    builder.append(" and ");
                }
            }
        }


        System.out.println(builder);
    }
}

