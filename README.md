# CS1180

Course Content for Duncan's CS1180 - Computer Science I - at Wright State University

## Environment Setup

1. Install Adopt Open JDK 17 (select the default options)
   - Download from [ninite.com](https://ninite.com/)
     - Mac / Linux Users: https://adoptium.net/temurin/releases/?version=17
   - JDK = Java Development Kit
   - Includes a java code compiler and virtual environment where your compiled code runs
   - NOTE: JRE = Java Runtime Environment. Runs compiled Java code.  You cannot compile Java source code if you only have a JRE installed.
2. Install Visual Studio Code
   - Download from [ninite.com](https://ninite.com/)
     - Mac / Linux users: https://visualstudio.microsoft.com/downloads/
   - Code is a text editor at the start - extensions give it support for languages you want to work with
3. In VSCode, go to Extensions, search for the WSU CSE extension
   - This extension includes extensions for other languages you’ll find in future courses
4. Restart VSCode in order for extensions to take effect

## Special Notes on VSCode

- Create a Java Project in VSCode with Command Palette

  - Ctrl + Shift + P = Command Palette
  - Type “Java”, then select “Java: Create Java Project”
  - Project names don’t matter (for class, keep an eye on assignment instructions)

- Turning off Parameter Names

  - Parameter names are the variable names used by methods we call. One of the extensions has these display by default. They are not part of your code, they are just reminders.
  - Ctrl + Shift + P (to open VSCode Command Palette) -> Search for “Settings”, select “Preferences: Open User Settings (JSON)”
  - Add this line: `"editor.inlayHints.enabled": "off"`
  - You can choose to not do this, but it annoys me, so I’m turning it off.

- Change Color Theme

  - File -> Preferences -> Color Theme

- Colorblind Themes

  - [Install "Slack" Color Theme package](https://marketplace.visualstudio.com/items?itemName=felipe-mendes.slack-theme)
  - Can now select Slack Color Themes for "Protanopia & Deuteranopia" and "Tritanopia"

## Troubleshooting VSCode + Java Extension

- Restart VSCode in order for extensions to take effect
- https://stackoverflow.com/questions/57148090/java-project-in-vs-code-no-delegatecommandhandler-for-vscode-java-validatelaun
- https://github.com/Microsoft/vscode-java-debug/blob/main/Troubleshooting.md
