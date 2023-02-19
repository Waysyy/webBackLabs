class MobilePhone(private val phoneNumber: String) {
    private val contacts = ArrayList<Contact>()

    fun addNewContact(contact: Contact): Boolean {
        if (findContact(contact) >= 0) {
            return false
        }
        contacts.add(contact)
        return true
    }

    fun findContact(contact: Contact): Int {
        return contacts.indexOf(contact)
    }
}


