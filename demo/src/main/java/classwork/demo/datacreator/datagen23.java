package classwork.demo.datacreator;

public class datagen23 {

    //
//    public static Room generateRoom() {
//        Room room = new Room();
//        room.setBasePrice(faker.number().randomDouble(2, 50, 300));
//        room.setAvailable(faker.bool().bool());
//        room.setType(RoomType.values()[faker.number().numberBetween(0, RoomType.values().length)]);
//        room.setPictureUrls(UnsplashService.getRandomHotelRoomPictures());
//        return room;
//    }
//
//    public static User generateUser() {
//        User user = new User();
//        String firstName = faker.name().firstName().toLowerCase();
//        String lastName = faker.name().lastName().toLowerCase();
//        user.setUsername(firstName + "." + lastName); user.setPassword(faker.internet().password());
//        user.setEmail(faker.internet().emailAddress());
//        user.setFirstName(faker.name().firstName());
//        user.setLastName(faker.name().lastName());
//        user.setLoyalty(Loyalty.values()[faker.number().numberBetween(0, Loyalty.values().length)]);
//        user.setDiscount(Discount.getDiscountForUser(user));
//        return user;
//    }
//
//    public static HotelBooking generateHotelBooking(User user, Room room) {
//        HotelBooking booking = new HotelBooking();
//        booking.setUser(user);
//        booking.setRoom(room);
//        booking.setCheckInDateTime(LocalDateTime.now().plusDays(faker.number().numberBetween(1, 30)));
//        booking.setCheckOutDateTime(booking.getCheckInDateTime().plusDays(faker.number().numberBetween(1, 14)));
//
//        Payment payment = new Payment();
//        payment.setType(PaymentType.values()[faker.number().numberBetween(0, PaymentType.values().length)]);
//        payment.updateAmount(room, user.getDiscount());
//        booking.setPayment(payment);
//
//        return booking;
//    }



}
