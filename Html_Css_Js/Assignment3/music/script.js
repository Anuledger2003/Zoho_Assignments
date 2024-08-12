document.addEventListener('DOMContentLoaded', () => {
    const playlistContainer = document.getElementById('playlist');
    const favoritesContainer = document.getElementById('favorites');
    const songSelector = document.getElementById('song-selector');
    const addSongBtn = document.getElementById('add-song-btn');
    const playPauseBtn = document.getElementById('play-pause-btn');
    const prevBtn = document.getElementById('prev-btn');
    const nextBtn = document.getElementById('next-btn');
    const songTitle = document.getElementById('song-title');
    const songArtist = document.getElementById('song-artist');
    const albumCover = document.getElementById('album-cover');
    
    let currentSongIndex = 0;
    let isPlaying = false;
    let playlist = [];
    let favorites = [];

    const audio = new Audio();

    function loadSong(song) {
        audio.src = URL.createObjectURL(song.file);
        songTitle.textContent = song.name;
        songArtist.textContent = song.artist || 'Unknown Artist';
        albumCover.src = song.cover || 'default-cover.jpg';
    }

    function playSong() {
        audio.play();
        isPlaying = true;
        playPauseBtn.textContent = '❚❚';
    }

    function pauseSong() {
        audio.pause();
        isPlaying = false;
        playPauseBtn.textContent = '►';
    }

    function togglePlayPause() {
        if (isPlaying) {
            pauseSong();
        } else {
            playSong();
        }
    }

    function nextSong() {
        currentSongIndex = (currentSongIndex + 1) % playlist.length;
        loadSong(playlist[currentSongIndex]);
        playSong();
    }

    function prevSong() {
        currentSongIndex = (currentSongIndex - 1 + playlist.length) % playlist.length;
        loadSong(playlist[currentSongIndex]);
        playSong();
    }

    function addSongToPlaylist(file) {
        const song = {
            name: file.name.replace(/\.[^/.]+$/, ""),
            file: file,
            cover: 'default-cover.jpg' // This could be enhanced to load album cover if available
        };
        playlist.push(song);
        displaySongInPlaylist(song);
    }

    function displaySongInPlaylist(song) {
        const songItem = document.createElement('div');
        songItem.classList.add('song-item');
        songItem.textContent = song.name;

        const favBtn = document.createElement('button');
        favBtn.textContent = '★';
        favBtn.onclick = () => toggleFavorite(song);

        songItem.appendChild(favBtn);
        playlistContainer.appendChild(songItem);
    }

    function toggleFavorite(song) {
        if (favorites.includes(song)) {
            favorites = favorites.filter(fav => fav !== song);
        } else {
            favorites.push(song);
        }
        displayFavorites();
    }

    function displayFavorites() {
        favoritesContainer.innerHTML = '';
        favorites.forEach(song => {
            const songItem = document.createElement('div');
            songItem.classList.add('song-item');
            songItem.textContent = song.name;
            favoritesContainer.appendChild(songItem);
        });
    }

    addSongBtn.addEventListener('click', () => songSelector.click());

    songSelector.addEventListener('change', (event) => {
        const files = event.target.files;
        for (let file of files) {
            addSongToPlaylist(file);
        }
        if (playlist.length === 1) {
            loadSong(playlist[0]);
        }
    });

    playPauseBtn.addEventListener('click', togglePlayPause);
    nextBtn.addEventListener('click', nextSong);
    prevBtn.addEventListener('click', prevSong);
});
