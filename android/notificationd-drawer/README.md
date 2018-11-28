# Notification
## Description
A notification is a message that Android displays outside of an app's UI
to provide the user with reminder, communication from other people, or other
timely information from an app.

Users can tap the notification to open the app or take an action directly
from the notification.

A notification can appears to users in different locations and formats:
- Status bar and notification drawer
- Headers-up notification (a floating window)
- Lock screen
- App icon badge
- Wear OS device

## Simple notification

## Status Bar
<img src="https://github.com/lemarcque/software-skills/blob/master/android/notificationd-drawer/ressource/img/status_bar.png?raw=true" alt="alt text" width="400">

## Navigation Drawer
<img src="https://github.com/lemarcque/software-skills/blob/master/android/notificationd-drawer/ressource/img/navigation-drawer.png?raw=true" alt="alt text" width="400">

# Code
You need to add the dependencies of the support library in the file `build.gradle` like below:
```
dependencies {
    implementation ‘’com.android.support:support-compat:28.0.0’’
}
```

# Ressource
For further information about how to implement this features, go the to Android official documentation 
- [Material design](https://developer.android.com/guide/topics/ui/notifiers/notifications)
- [Android doc](https://material.io/design/platform-guidance/android-notifications.html)
