class ValidationUnit{
    public boolean isValidString(String str) {
        return str != null && !str.isEmpty();
    }

    public boolean isValidPrice(double price) {
        return price > 0;
    }

}