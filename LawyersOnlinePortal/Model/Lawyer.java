
import java.util.*;

/**
 * 
 */
public class Lawyer extends LawyersOnlinePortal {

    /**
     * Default constructor
     */
    public Lawyer() {
    }

    /**
     * 
     */
    public String[] LawyerId;

    /**
     * 
     */
    public String Name;

    /**
     * 
     */
    public Date DOB;

    /**
     * 
     */
    public String Specialisation;

    /**
     * 
     */
    protected String Password;

    /**
     * 
     */
    public String Emailid;

    /**
     * 
     */
    public String Address;


    /**
     * @param Name 
     * @param DOB 
     * @param Address 
     * @param Specialisation 
     * @param Emailid 
     * @param password 
     * @return
     */
    public string Register(void Name, void DOB, void Address, void Specialisation, void Emailid, void password) {
        // TODO implement here
        return null;
    }

    /**
     * @param Emailid 
     * @param password 
     * @return
     */
    public void Login(void Emailid, void password) {
        // TODO implement here
        return null;
    }

    /**
     * @param Template_Id 
     * @param Case_Category 
     * @param Format_Link 
     * @return
     */
    public JSON UseTemplate(void Template_Id, void Case_Category, void Format_Link) {
        // TODO implement here
        return null;
    }

    /**
     * @param CaseNumber 
     * @param CaseDate 
     * @param CientDetails 
     * @param LawyerID 
     * @param JudgementDetails 
     * @param CaseCategory 
     * @return
     */
    public void FileCase(void CaseNumber, void CaseDate, void CientDetails, void LawyerID, void JudgementDetails, void CaseCategory) {
        // TODO implement here
        return null;
    }

    /**
     * @param Category 
     * @return
     */
    public String ViewPDF(void Category) {
        // TODO implement here
        return "";
    }

    /**
     * @param ISBN 
     * @return
     */
    public JSON DownloadPDF(void ISBN) {
        // TODO implement here
        return null;
    }

    /**
     * @param Blog_ID 
     * @param Blog_Author 
     * @param Blog_title 
     * @param B_Flag 
     * @return
     */
    public Boolean PublishBlog(void Blog_ID, void Blog_Author, void Blog_title, void B_Flag) {
        // TODO implement here
        return null;
    }

    /**
     * @param News 
     * @param N_flag 
     * @return
     */
    public URL ViewNews(void News, void N_flag) {
        // TODO implement here
        return null;
    }

    /**
     * @param ExamDetails 
     * @param E_Flag 
     * @return
     */
    public URL ViewExamLinks(void ExamDetails, void E_Flag) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void Logout() {
        // TODO implement here
        return null;
    }

}