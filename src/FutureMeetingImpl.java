import java.util.Calendar;
import java.util.Set;


public class FutureMeetingImpl extends MeetingImpl implements FutureMeeting {

	public FutureMeetingImpl(int id, Calendar date, Set<Contact> contacts){
		
		//TODO - add constructor exceptions, copyconstructo

		super(id, date, contacts);
		}
}
