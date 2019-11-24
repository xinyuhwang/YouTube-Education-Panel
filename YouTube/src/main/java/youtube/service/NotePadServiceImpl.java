package youtube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import youtube.dao.NotePadDao;
import youtube.model.NotePad;

/* 
 * This class implements NotePadService and enables notepad dao access in the controller
 */
@Service
public class NotePadServiceImpl {
	@Autowired
	public NotePadDao notePadDao;
	
	public NotePad getNotePadById(int notePadId) {
		return notePadDao.getNotePadById(notePadId);
	}

	public void deleteNotePad(int notePadId) {
		notePadDao.deleteNotePad(notePadId);
	}

	public void addNotePad(NotePad notePad) {
		notePadDao.addNotePad(notePad);
	}

	public void updateNotePad(NotePad notePad) {
		notePadDao.updateNotePad(notePad);
	}
}
