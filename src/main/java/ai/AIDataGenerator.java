package ai;

public class AIDataGenerator {

    public static String generateFirstName() {

        String prompt =
                PromptBuilder.employeeNamePrompt();

        return OpenAIClient.askAI(prompt);
    }
}