# CoursePortal

A brief description of what this project does and who it's for


## Authors

- [@Jeet-Codes](https://github.com/Jeet-Codes)




## Deployment

To work with the CoursePortal_Backend project hosted on GitHub, follow these steps:

Certainly! To run a Spring Boot project from the given GitHub repository using IntelliJ IDEA or Spring Tool Suite (STS) with JDK 17, follow these steps:

1. **Clone the Repository**:
   - Open your terminal or Git Bash.
   - Navigate to the directory where you want to clone the project.
   - Run the following command to clone the repository:
     ```bash
     git clone https://github.com/Jeet-Codes/CoursePortal_Backend.git
     ```
   - This will create a local copy of the project on your machine.

2. **Open the Project in IntelliJ IDEA or STS**:
   - Open IntelliJ IDEA or Spring Tool Suite.
   - Click on **File** > **Open** and select the cloned project directory (`CoursePortal_Backend`).

3. **Configure JDK 17**:
   - Make sure you have JDK 17 installed on your system.
   - In IntelliJ IDEA:
     - Go to **File** > **Project Structure**.
     - Under **Project**, set the **Project SDK** to JDK 17.
   - In STS:
     - Go to **Window** > **Preferences** > **Java** > **Installed JREs**.
     - Add JDK 17 if it's not already listed.

4. **Build and Run the Application**:
   - In IntelliJ IDEA:
     - Open the `CoursePortalBackendApplication.java` file .
     - Right-click on the class and select **Run 'CoursePortalBackendApplication'**.
     - The Spring Boot application will start, and you can access it in your browser at [http://localhost:8181](http://localhost:8181).
   - In STS:
     - Similar to IntelliJ IDEA, locate the `CoursePortalBackendApplication.java` file and run it.
     - Access the application at [http://localhost:8181](http://localhost:8181).

5. **Explore and Modify**:
   - You're all set! Now you can explore the code, make changes, and see live updates in your browser.
   - The project structure includes components, controllers, services, and other Spring-related files.

6. **Build for Production**:
   - When you're ready to deploy your app, create a production build:
     - In IntelliJ IDEA, build an executable JAR by running the following command in the terminal:
       ```bash
       mvn clean package
       ```
     - In STS, you can also use Maven to build the project.

Remember to replace the repository URL with the actual one you want to clone. Happy coding! 😊

Note: If you encounter any issues related to JDK 17 compatibility, ensure that your IDE is configured correctly to use JDK 17. You can manage SDKs in the project settings. If needed, refer to the official documentation for IntelliJ IDEA or STS for additional guidance.

