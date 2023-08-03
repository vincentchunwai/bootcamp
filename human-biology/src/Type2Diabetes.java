
class Type2Diabetes extends Disease {
    private double fastingBloodSugarLevel;

    public Type2Diabetes(double fastingBloodSugarLevel) {
        this.fastingBloodSugarLevel = fastingBloodSugarLevel;
    }

    public boolean isDiagnosed(human human) {
        if (human.getGender() == Gender.MALE) {
            return fastingBloodSugarLevel >= 126;
        } else {
            return fastingBloodSugarLevel >= 115;
        }
    }
}
