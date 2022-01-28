package Quiz;

abstract class Question {
    String question = "";
    int pointValue;

    public Question(String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public void String displayQuestion(ArrayList<String> questions){
        for(int i=0; i<questions.size(); i++)
            System.out.prinln(question)
        return question
    }





}
