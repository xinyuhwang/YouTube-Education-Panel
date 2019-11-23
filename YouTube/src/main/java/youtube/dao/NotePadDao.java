package youtube.dao;

import youtube.model.*;

public interface NotePadDao {
	NotePad getNotePadById(int NotePadId);
	
	void deleteNotePad(int NotePadId);
	
	void addNotePad(NotePad notepad);
	
	void updateNotePad(NotePad notepad);
}
