public record Usuario(String userId, String id, String title, String completed) {
    @Override
    public String toString() {
        return String.format("ID: %s%n" +
                "Title: %s%n",id, title);
    }
}
