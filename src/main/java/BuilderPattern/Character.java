package BuilderPattern;

public class Character {
    private String name;
    private String gender;
    private int age;

    private String job;
    private String address;

    public Character() {}

    public Character(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
        this.job = builder.job;
        this.address = builder.address;
    }

    public static class Builder implements Buildable {

        private final String name;
        private final String gender;
        private final int age;

        private String job;
        private String address;

        public Builder(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        @Override
        public Character build() {
            return new Character(this);
        }
    }
}
