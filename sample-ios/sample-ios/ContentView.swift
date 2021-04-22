import SwiftUI
import shared



struct ContentView: View {

class PlatformImpl: Platform {
     func platform() -> String {
        return "iOs"
    }
}
    var body: some View {
            Text(Greeting().greeting(platform: PlatformImpl()))
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
