import React, { useState } from "react";
import { calculateWinner } from "../helper"
import Board from "./Board";

const Game = () => {
    const [history, setHistory] = useState([Array(9).fill(null)]);
    const [stepNumber, setStepNumber] = useState(0);
    const [xIsNext, setXisNext] = useState(true);
    const winner = calculateWinner(history[stepNumber]);
    const nextPlayer = xIsNext ? "X" : "O"; 

    const handleClick = (i) => {
        const historyPoint = history.slice(0, stepNumber + 1);
        const current = historyPoint[stepNumber];
        const squares = [...current]
        if (winner || squares[i]) return
        squares[i] = nextPlayer;
        setHistory([...historyPoint, squares])
        setStepNumber(historyPoint.length)
        setXisNext(!xIsNext)
    };

    return(
        <>
            <div className="Game">
                <h1>Gra W Kółko i Krzyżyk</h1>
                <Board squares={history[stepNumber]} onClick={handleClick} />
                <div className="info-wrapper">
                    <h3>{winner ? "Wygrywa: " + winner : "Następny run ma Gracz " + nextPlayer}</h3>
                </div>
            </div>
        </>
    )
};

export default Game;
