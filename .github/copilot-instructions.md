<!-- Use this file to provide workspace-specific custom instructions to Copilot. For more details, visit https://code.visualstudio.com/docs/copilot/copilot-customization#_use-a-githubcopilotinstructionsmd-file -->
- [x] Verify that the copilot-instructions.md file in the .github directory is created.

- [x] Clarify Project Requirements
	<!-- Ask for project type, language, and frameworks if not specified. Skip if already provided. -->

- [x] Scaffold the Project
	<!--
	Ensure that the previous step has been marked as completed.
	Call project setup tool with projectType parameter.
	Run scaffolding command to create project files and folders.
	Use '.' as the working directory.
	If no appropriate projectType is available, search documentation using available tools.
	Otherwise, create the project structure manually using available file creation tools.
	-->

- [x] Customize the Project
	<!--
	Verify that all previous steps have been completed successfully and you have marked the step as completed.
	Develop a plan to modify codebase according to user requirements.
	Apply modifications using appropriate tools and user-provided references.
	Skip this step for "Hello World" projects.
	-->

- [x] Install Required Extensions
	<!-- ONLY install extensions provided mentioned in the get_project_setup_info. Skip this step otherwise and mark as completed. -->

- [x] Compile the Project
	<!--
	Verify that all previous steps have been completed.
	Install any missing dependencies.
	Run diagnostics and resolve any issues.
	Check for markdown files in project folder for relevant instructions on how to do this.
	-->

- [x] Create and Run Task
	<!--
	Verify that all previous steps have been completed.
	Check https://code.visualstudio.com/docs/debugtest/tasks to determine if the project needs a task. If so, use the create_and_run_task to create and launch a task based on package.json, README.md, and project structure.
	Skip this step otherwise.
	 -->

- [x] Launch the Project

- [x] Ensure Documentation is Complete

## Project: Spring Boot + Thymeleaf
Simple demo application with a controller mapping "/" to display "xin chào các bạn" via Thymeleaf.

### To Run the Application
1. Ensure Maven is installed at `C:\Users\caokh\Tools\apache-maven-3.9.6`
2. Navigate to project root: `c:\Users\caokh\buoi3`
3. Run: `mvn spring-boot:run`
4. Open browser: http://localhost:8080

### Project Structure
- **Controller**: [src/main/java/com/example/buoi3/controller/HomeController.java](src/main/java/com/example/buoi3/controller/HomeController.java)
- **View**: [src/main/resources/templates/index.html](src/main/resources/templates/index.html)
- **Main Application**: [src/main/java/com/example/buoi3/Buoi3Application.java](src/main/java/com/example/buoi3/Buoi3Application.java)

### Application Status
- ✓ Build: Complete
- ✓ Running: http://localhost:8080 (Tomcat on port 8080)
