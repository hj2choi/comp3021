package base;

import java.io.*;

public class TextNote extends Note implements Serializable{

	private String content;

	public TextNote(String title) {
		super(title);
	}

	public String getContent() {
		return content;
	}

	public TextNote(String title, String content) {
		super(title);
		this.content = content;
	}

	public TextNote(File f) {
		super(f.getName());
		this.content = getTextFromFile(f.getAbsolutePath());
	}

	private String getTextFromFile(String absolutePath) {
		String result="";
		File file = new File(absolutePath);
		FileInputStream fis = null;
		BufferedReader reader = null;

		//TODO
		try {
			fis = new FileInputStream(file);
			reader = new BufferedReader(new InputStreamReader(fis));
			while ((result = reader.readLine()) != null) {
				System.out.println(result);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			e.printStackTrace();
		}


		return result;
	}

	public void exportTextToFile(String pathFolder) {
		//TODO
		//File file = new File(pathFolder + File.separator + ""/*TODO*/	+ ".txt");
		//TODO
		FileWriter writer = null;
		BufferedWriter out = null;
		try {
			String noteTitle = this.getTitle();
			noteTitle = noteTitle.replaceAll(" ", "_");

			File file = new File(pathFolder + File.separator + noteTitle + ".txt");
			writer = new FileWriter(file.getAbsolutePath());
			out = new BufferedWriter(writer);
			out.write(this.getContent());
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return;
	}



}
