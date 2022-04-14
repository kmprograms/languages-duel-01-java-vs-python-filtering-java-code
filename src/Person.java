public record Person(String name, int age) {
    public boolean isAdult() {
        return age >= 18;
    }

    public Person(int age) {
        this("A", age);
    }
}
