class Race {
    String currentLeader = ""; // Имя текущего лидера
    int leaderDistance = 0; // Дистанция, пройденная лидером

    // Метод для определения нового лидера
    public void determineLeader(Car car) {
        int carDistance = 24 * car.speed; // Рассчитываем дистанцию
        if (carDistance > leaderDistance) {
            currentLeader = car.name; // Обновляем лидера
            leaderDistance = carDistance; // Обновляем дистанцию лидера
        }
    }
    // Метод для получения имени текущего лидера
    public String getLeader() {
        return currentLeader;
    }
}
