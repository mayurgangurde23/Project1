package Library;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.Properties;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



import javax.mail.*;

public class UtilityClass {
	public static String getTD(int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\mayurgangurde23\\eclipse-workspace\\Jarvis__\\TestData\\Jarvis.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return value;
	}
	public static String getDatafromPropertyFile(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\mayurgangurde23\\eclipse-workspace\\Jarvis__\\Config.properties");
		Properties p=new Properties();
		p.load(file);

		String value = p.getProperty(key);
		return value;
	}
	public static String GmailUtils() throws Exception {
		System.out.println("Wait for 30 second");
		Thread.sleep(30000);
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imap");
		props.setProperty("mail.imaps.partialfetch", "false");
		props.put("mail.imap.ssl.enable", "true");
		props.put("mail.mime.base64.ignoreerrors", "true");
		Session session = Session.getDefaultInstance(props, null);
		Store store = session.getStore("imap");
		store.connect("imap.gmail.com", "mayur.gangurde+000000@techstalwarts.com","oenqvzakqjdmhwlm");
		Folder folder = store.getFolder("Inbox");
		folder.open(Folder.READ_WRITE);

		//		    System.out.println("Total Messages:" + folder.getMessageCount());
		//		    System.out.println("Unread Messages:" + folder.getUnreadMessageCount());

		Message[] messages = folder.getMessages();

		for(int i = folder.getMessageCount() - 1; i > 0; i--) {
			Message msg = messages[i];
			if(!msg.isSet(Flags.Flag.SEEN)) {
				return getOtpFromBody(msg);
			}
		}
		return "";
	}

	public static String getOtpFromBody(Message email) throws IOException, MessagingException {
		String line;
		BufferedReader reader = new BufferedReader(new InputStreamReader(email.getInputStream()));
		while ((line = reader.readLine()) != null) {
			if(line.contains("OTP :")) {
				String[] otp = line.split(" : ", 2);
				return otp[1];
			}
		}
		return "";
	}

}
