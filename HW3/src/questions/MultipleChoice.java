package questions;

public class MultipleChoice implements Question{
    private String text;
    private int answer;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String option5;
    private String option6;
    private String option7;
    private String option8;
    private int order;

    public MultipleChoice(String text, String answer, String option1, String option2, String option3) {
        this.text = text;
        int stringToAnswer = Integer.parseInt(answer);
        this.answer = stringToAnswer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.order = 2;
    }

    public MultipleChoice(String text, String answer, String option1, String option2, String option3, String option4) {
        this.text = text;
        int stringToAnswer = Integer.parseInt(answer);
        this.answer = stringToAnswer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.order = 2;
    }

    public MultipleChoice(String text, String answer, String option1, String option2, String option3, String option4,
                          String option5) {
        this.text = text;
        int stringToAnswer = Integer.parseInt(answer);
        this.answer = stringToAnswer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.order = 2;
    }

    public MultipleChoice(String text, String answer, String option1, String option2, String option3, String option4,
                          String option5, String option6) {
        this.text = text;
        int stringToAnswer = Integer.parseInt(answer);
        this.answer = stringToAnswer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.option6 = option6;
        this.order = 2;
    }

    public MultipleChoice(String text, String answer, String option1, String option2, String option3, String option4,
                          String option5, String option6, String option7) {
        this.text = text;
        int stringToAnswer = Integer.parseInt(answer);
        this.answer = stringToAnswer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.option6 = option6;
        this.option7 = option7;
        this.order = 2;
    }

    public MultipleChoice(String text, String answer, String option1, String option2, String option3, String option4,
                          String option5, String option6, String option7, String option8) {
        this.text = text;
        int stringToAnswer = Integer.parseInt(answer);
        this.answer = stringToAnswer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.option6 = option6;
        this.option7 = option7;
        this.option8 = option8;
        this.order = 2;
    }

    @Override
    public int getOrder() {
        return this.order;
    }

    @Override
    public QuestionType getType() {
        return QuestionType.MULTIPLE_CHOICE;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public String answer(String quesAnswer) {
        int inputAnswer = Integer.parseInt(quesAnswer);
        if(inputAnswer == this.answer){
            return "Correct";
        }
        return "Incorrect";
    }

    @Override
    public int compareTo(Object o) {
        Question question = (Question) o;
        if(question.getType() == QuestionType.MULTIPLE_CHOICE) {
            if(this.text.compareTo(question.getText()) > 0){
                return 1;
            } else if (this.text.compareTo(question.getText()) < 0 ){
                return -1;
            } else {
                return 0;
            }
        } else if (question.getType() == QuestionType.TRUE_FALSE){
            return 1;
        }  else {
            return -1;
        }
    }
}
