package org.conversorSql;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.localai.LocalAiChatModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Model {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Model(){
        this.LigaLm();
        this.EscolheLM();
    }

    public String converterSql()  {

        ChatLanguageModel model = LocalAiChatModel.builder()
                .baseUrl("http://localhost:1234/v1")
                .modelName("TheBloke/nsql-llama-2-7B-GGUF")
                .temperature(0.9)
                .build();

        String languageSql = model.generate(this.getContent());
        return languageSql;
    }
    public void LigaLm(){

        String command = "cmd.exe /c lms server start";

        ProcessBuilder processBuilder = new ProcessBuilder();

        processBuilder.command(command.split(" "));

        try {

            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nComando finalizado com código: " + exitCode);

        } catch (IOException | InterruptedException e) {

            e.printStackTrace();
        }

    }

    public void EscolheLM( ){
        String nameModel = "TheBloke/nsql-llama-2-7B-GGUF";
        String command = "cmd.exe /c lms load " + nameModel;

        ProcessBuilder processBuilder = new ProcessBuilder();


        processBuilder.command(command.split(" "));

        try {

            Process process = processBuilder.start();


            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;


            while ((line = reader.readLine()) != null) {

            }


            int exitCode = process.waitFor();

        } catch (IOException | InterruptedException e) {

            e.printStackTrace();

        }
    }

}
