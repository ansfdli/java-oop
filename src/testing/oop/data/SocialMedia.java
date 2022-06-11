package testing.oop.data;

class SocialMedia {
  String name;
}

final class Facebook extends SocialMedia {
  void login(String username, String passqord){
    // isi method
  }
}

// Error (can't extends from final class)
//class FakeFacebook extends Facebook {
//
//}
