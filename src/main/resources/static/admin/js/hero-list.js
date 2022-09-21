getHeroes();

function getHeroes()
{
	fetch("/api/heroes")
		.then((reponse) => reponse.json())
		.then(createHeroList)
}

function createHeroList(heroList)
{
	const heroDiv = document.getElementById('hero-list');
	
	for (let hero of heroList)
	{
		const heroTag = createHero(hero);
		heroDiv.appendChild(heroTag);
	}
}

function createHero(hero)
{
	const div = document.createElement('div');
	div.setAttribute('data-id', hero.id);
	
	const nameTag = document.createElement('h2');
	nameTag.textContent = hero.heroName;
	
	div.appendChild(nameTag);
	
	const goldTag = document.createElement('p');
	goldTag.textContent = 'Or de départ : ' + hero.gold;
	
	div.appendChild(goldTag);
	
	return div;
}