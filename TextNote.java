package base;

import java.io.*;

public class TextNote extends Note implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		BufferedWriter bw = null;
		try{
		File file = new File(pathFolder + this.getTitle().replaceAll("\\s+", "_") + ".txt");
			if(!file.exists()){
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			bw.write(this.content);
			bw.close();
			
			
		} catch (IOException ioE){
			ioE.printStackTrace();
		}
	}



}
