<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Java GUI App Docker Setup</h1>
    <p>Follow the steps below to build and run the Java GUI application in a Docker container and display the GUI on your local machine.</p>
    <h2>Step 1: Install Xming Server</h2>
    <p>Download and install Xming Server from the following link:</p>
    <p><a href="https://sourceforge.net/projects/xming/">Xming Server Download</a></p>
    <p>Once Xming Server is running, you will be able to display the Java GUI on your local machine.</p>
    <h2>Step 2: Build the Docker Image</h2>
    <p>In the root directory of your project, run the following command to build the Docker image:</p>
    <pre><code>docker build -t java-gui-app .</code></pre>
    <h2>Step 3: Run the Application</h2>
    <p>After building the image, run the app with the following command:</p>
    <h3>PowerShell Command:</h3>
    <pre><code>docker run -it --rm -e DISPLAY=host.docker.internal:0.0 -v ${PWD}/shared:/shared --name java-gui-app java-gui-app</code></pre>
    <h3>Windows Command Prompt (CMD):</h3>
    <pre><code>docker run -it --rm ^
  -e DISPLAY=host.docker.internal:0.0 ^
  -v /tmp/.X11-unix:/tmp/.X11-unix ^
  --name java-gui-app ^
  java-gui-app</code></pre>
    <p>This will start the Java GUI app inside the Docker container and forward the display to your local machine via Xming.</p>
    <h2>Step 4: Modify Code for Syntax Analysis</h2>
    <p>You can modify the <code>main.cpp</code> file located in the <strong>shared</strong> folder to test other syntax analysis or modify the application as needed.</p>
    <h2>Enjoy!</h2>
    <p>Once the app is running, you should be able to interact with the Java GUI application displayed on your local machine.</p>
</body>
</html>
