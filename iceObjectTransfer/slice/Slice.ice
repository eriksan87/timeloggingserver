module condivisione{
module prova{

	class persona
	{
		string nome;
		void setNome(string s);
		string getNome();
	};
};

module prova2{
interface personaInterface{
	::condivisione::prova::persona getPersona();
};
	
};
};