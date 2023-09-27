package com.pancordev;

public interface Permission {

    String value();

    static Permission of(String value) {
        try {
            return Permission.Enum.valueOf(value);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.err.println("Failed to parse Permission: '" + value + "'");
            return new Fallback(value);
        }
    }

    enum Enum implements Permission {

        PERMISSION_ONE,
        PERMISSION_TWO,
        PERMISSION_THREE;

        @Override
        public String value() {
            return name();
        }
    }

    class Fallback implements Permission {

        private final String value;

        public Fallback(String value) {
            this.value = value;
        }

        @Override
        public String value() {
            return value;
        }
    }
}
